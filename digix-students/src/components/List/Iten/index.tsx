import style from './iten.module.scss';

export default function Iten(props:{tarefa: string, tempo: string}) {
    const {tarefa, tempo }= props;
    return (
        <li className = { style.item } >
            
            <h3>{tarefa}</h3>
            <span>{tempo}</span>
        </li >
    );
}

