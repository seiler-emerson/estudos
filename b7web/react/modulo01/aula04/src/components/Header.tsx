type Props = {           //É necessário definir o tipo e qual props será recebida.
    title: string;
}

export const Header = (props: Props) => {   //É necessário referenciar o type criado
    return (                                //Para usar é necessário abrir uma expressão e usar a props, no caso como um objeto
      <header>
        <h1>{props.title}</h1>            
        <hr />
      </header>
    )
}