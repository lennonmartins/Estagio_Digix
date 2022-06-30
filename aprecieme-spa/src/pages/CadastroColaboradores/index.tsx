import { Box, Button } from '@mui/material';
import { useNavigate } from 'react-router-dom';
import KeyboardBackspaceIcon from '@mui/icons-material/KeyboardBackspace';
import FormularioCadastroColaborador from '../components/FormCadastro';
import FormCadastro from '../components/FormCadastro';

interface Props {
    token: any
}
export default function CadastroColaboradores({token}: Props){
       
  const navegar = useNavigate();

  return(
    <Box>
      <FormCadastro token={token} />
      < Button
        color="secondary"
        sx ={{mt: 2}}
        variant="contained"
        startIcon={<KeyboardBackspaceIcon/>}
        onClick ={ () => {navegar(-1);}}>
      </Button>
    </Box>
  );
}