import { Link } from 'react-router-dom';
import { ReactComponent as Logo } from '../../../assets/logo-orange.svg';
import style from './Menu.module.scss';
import LogoAprecie from '../../../assets/logoAprecie.png';

export default function menu() {
//   const rotas = [{
//     label: 'Colaboradores',
//     to: '/'
//   },
//   {
//     label: 'Cadastro',
//     to: '/cadastro'
//   },
//   {
//     label: 'Apreciações',
//     to: '/apreciacoes'
//   }
//   ];
//   return (
//     <><nav>
//       <Logo />
//       <ul>
//         {rotas.map((rota, index) => <li key={index}>
//           <Link to={rota.to}>
//             {rota.label}
//           </Link>
//         </li>
//         )}
//       </ul>
// </nav>

  return ( 
    <header className={style.cabecalhoSistema}>
      <div className={style.cabecalhoSistema__containerPrimario}>
        <a href="/">
          <img className="cabecalho-sistema__logo" width="105" src={LogoAprecie} alt="Logotipo do Digix UI"/>
        </a>
        <nav className={style.cabecalhoSistema__menu} aria-label="Menu principal">
          <ul className={style.cabecalhoSistema__listaDeItens}>
            <li>
              <a className={style.cabecalhoSistema__itemDeMenu} href="#">Colaboradores</a>
            </li>
            <li>
              <a className={style.cabecalhoSistema__itemDeMenu} href="#" aria-label="Com pílula - Você tem 456 novas notificações"> Cadastro
              </a>
            </li>
            <li className="dropdown">
              <a className={style.cabecalhoSistema__itemDeMenu} aria-haspopup="true" href="#">
                                  Apreciações<i className="far fa-angle-down u-margem-esquerda-pequena"></i>
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </header>
  );
}