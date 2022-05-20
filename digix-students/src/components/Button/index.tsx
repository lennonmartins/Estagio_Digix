import React from "react";
import './style.scss'

class Button extends React.Component{
    render(){
        return(
            <button className="botao" style={{backgroundColor: 'blue' }}>
                Botão
            </button>
        );
    }
}

export default Button;