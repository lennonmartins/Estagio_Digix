import React from "react";
import style from './Button.module.scss'

class Button extends React.Component<{
    children:any,
    type?: "button" | "submit" | "reset" | undefined
}>{
    render(){
        const {type = "button"} = this.props;
        return(
            <button type={type} className={style.botao} >
                {this.props.children}
            </button>
        );
    }
}

export default Button;