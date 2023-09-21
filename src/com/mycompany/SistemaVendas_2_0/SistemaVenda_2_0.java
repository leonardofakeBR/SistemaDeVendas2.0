
package com.mycompany.SistemaVendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.MenuPrincipal;
/**
 *
 * @author 10156
 */
public class SistemaVenda_2_0 {
    public static void main(String[] args) {
        int opcaoMenu; 

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setVisible(true);
        
        while(true){
            opcaoMenu = VisaoMenu.menuPrincipal();

            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
            }else if(opcaoMenu == Constantes.REMOVER){
                ControleSistema.remover(VisaoMenu.menuRemocaoProduto());
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }else if(opcaoMenu == Constantes.VENDER){
                ControleSistema.vender(VisaoMenu.menuVenderProduto());
            }
        }
    }
}