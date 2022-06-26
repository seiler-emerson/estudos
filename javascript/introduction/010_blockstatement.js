/* 

* Scope

  - Escopo determina a visibilidade de alguma variável no JS

  
*/

#Block Statement

```js
// vamos iniciar um bloco
{
  //aqui dentro é um bloco e posso colocar qualquer código
}  // aqui fechamos o bloco
```


## var
```js
// Var é global e poderá funcionar fora de um escopo de bloco
// hoisting = o JS pega as variáveis e eleva elas para o inicio.

console.log('> existe x antes do bloco?', x)

{
  var x = 0
}

console.log('> existe x depois do bloco?', x)
```