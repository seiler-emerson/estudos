import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { map } from 'rxjs';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})
export class TemplateFormComponent implements OnInit {

  usuario:any = {
    nome: null,
    email: null
  }

  
  constructor(
    private http: HttpClient,
  ) { }
  
  ngOnInit(): void {
  }
  
  onSubmit(form: any) {
    console.log(form);
    console.log(this.usuario);

    this.http.post('https://httpbin.org/post', JSON.stringify(form.value)).pipe(map( (res: any) => res )).subscribe(dados => console.log(dados)
    );
    
  }
  
  verificaValidTouched(campo: any) {
    return !campo.valid && campo.touched;
  }

  aplicaCSSErro(campo: any) {
    return {
      'has-error': this.verificaValidTouched(campo),
      'has-feedback': this.verificaValidTouched(campo),
    }
  }

  consultaCEP(cep: any, form:any) {
    cep = cep.replace (/\D/g, '');

    // Verifica se o campo possui valor informado
    if (cep != null && cep !== '') {
      this.resetaDadosForm(form)
      // Expressao regular para validar cep
      let validacep = /^[0-9]{8}$/;

      // Valida o formato do cep
      if(validacep.test(cep)) {
        this.http.get(`https://viacep.com.br/ws/${cep}/json/`)
        .pipe(map((dados: any) => dados))
        .subscribe(dados => this.populaDadosForm(dados, form))
      }
    }
  }

  populaDadosForm(dados:any, form:any) {
    form.form.patchValue( {
      endereco: {
        rua: dados.logradouro,
        cep: dados.cep ,
        complemento: dados.complemento,
        bairro: dados.bairro,
        cidade: dados.localidade,
        estado: dados.uf
      }
    })
  }

  resetaDadosForm(form:any) {
    form.form.patchValue( {
      endereco: {
        rua: null,
        complemento: null,
        bairro: null,
        cidade: null,
        estado: null
      }
    })
  }
}
