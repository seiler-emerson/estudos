type Props = {
    text: string;
    clickFn: () => void;
}

export const Botao = ({ text, clickFn }: Props) => {

    return (
        <button onClick={clickFn}>{text}</button>
    );
}