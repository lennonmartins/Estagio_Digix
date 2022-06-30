import { Link } from 'react-router-dom';
import { ReactComponent as Logo } from '../../../assets/logo-orange.svg';

export default function menu() {
  const rotas = [{
    label: 'Colaboradores',
    to: '/'
  },
  {
    label: 'Cadastro',
    to: '/cadastro'
  },
  {
    label: 'Apreciações',
    to: '/apreciacoes'
  }
  ];
  return (
    <nav>
      <Logo />
      <ul>
        {rotas.map((rota, index) => 
          <li key={index}>
            <Link to={rota.to}>
              {rota.label}
            </Link>
          </li>
        )}
      </ul>
    </nav>




  );
}