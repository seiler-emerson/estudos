type Props = {           //É necessário definir o tipo e qual props será recebida.
    title: string;
}

export const Header = ({ title }: Props) => {   //É necessário referenciar o type criado
    return (                                //Para usar é necessário abrir uma expressão e usar a props, no caso como um objeto
      <header>
        <h1>{title}</h1>            
        <hr />
      </header>
    )
}