import style from './List.module.scss';
import Iten from './Iten';
import { useState } from 'react';
import { ITarefa } from '../../types/ITarefa';

function Lista({tarefas}: {tarefas: ITarefa[],}) {
   
    return (

        <aside className={style.listaTarefa}>
            <h2>Estuda do dia</h2>
            <ul>
                {tarefas.map((iten, index) => (
                    <Iten
                        key={index}
                        tarefa={iten.tarefa}
                        tempo={iten.tempo}
                    />
                ))}
            </ul>
        </aside>
    );
}
export default Lista;