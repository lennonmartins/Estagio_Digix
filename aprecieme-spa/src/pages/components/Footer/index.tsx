import style from './Footer.module.scss';
import {ReactComponent as LogoFooter} from '../../../assets/logo-digix-laranja (1).svg';

export default function Footer(){
  return(
        
    <footer className={style.rodapeSistema}>
      <p className={style.rodapeSistemaTexto}>Desenvolvido por</p>
      <a href="http://www.digix.com.br/">
        <LogoFooter className={style.rodapeSistemaLogo}/>
        
      </a>
    </footer>  
  );
}