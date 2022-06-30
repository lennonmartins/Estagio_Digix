import { AddBox, SaveOutlined } from '@mui/icons-material';
import { Box, Button } from '@mui/material';
import { useNavigate } from 'react-router-dom';
import DataGridColaborador from '../components/DataGridColaborador';

export default function ListagemColaboradoresCadastrados(){
  const navegar = useNavigate();    
  return(
    <>
      <DataGridColaborador/>
      <Button
        sx={{mt:2}}
        color="secondary"
        variant="contained"
        href= '/cadastro'
        startIcon={<AddBox />}
        onClick={() => {navegar('/cadastro');}}>
            Cadastrar
      </Button>
      
    </>
  );
}