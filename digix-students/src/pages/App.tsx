
import Form from '../components/Form';
import List from '../components/List';
import style from  './App.module.scss';
import Cronometro from '../components/Cronometro';
import { useState } from 'react';
import { ITarefa } from '../types/ITarefa';

function App() {
  const [tarefas, setTarefas] = useState<ITarefa[]>([]);
  return (
    <div className= {style.AppStyle}>
      <Form setTarefas = {setTarefas}/>
      <Cronometro/>
      <List tarefas={tarefas}/>
    </div>
  );
}

export default App;
  