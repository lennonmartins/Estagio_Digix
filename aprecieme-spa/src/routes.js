import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import DataGridColaborador from './pages/components/DataGridColaborador';
import FormCadastro from './pages/components/FormCadastro';
import Menu from './pages/components/Menu';
import token from './data/token.json';
import ListagemColaboradoresCadastrados from './pages/ListagemColaboradoresCadastrados';
import Notfound from './pages/Notfound';
import CadastroColaboradores from './pages/CadastroColaboradores';
import Footer from './pages/components/Footer';

export default function AprecieRouter(){
  return(
    <Router>
      <Menu/>
      <Routes>
        <Route path="/" element={<ListagemColaboradoresCadastrados/>}/>
        <Route path="/cadastro" element={<CadastroColaboradores token={token}/>}/>
        <Route path="*" element={<Notfound/>}/>
      </Routes>
      <Footer/>
    </Router>
  );
}   