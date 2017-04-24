package elements;

import java.util.Arrays;

/**
 * Created by Richard on 23/04/2017.
 */
public class form {


    /*
    * Cria estrutura HTML de um botão
    * @param btn (Btn)
    * @return String HTML
    */

    public String buttonHTML(Btn btn){

        String classIcon = "";
        String[] types = {"success","success-outline","danger","danger-outline"};
        if( !Arrays.asList(types).contains(btn.getStr2()) ) {
            if (btn.getStr1() != null && btn.getStr2() != null && btn.getStr1().substring(0, 5).equals("icon-"))
                classIcon = " Btn--icon-before";
            else if (btn.getStr1() != null && btn.getStr2() != null && btn.getStr2().substring(0, 5).equals("icon-"))
                classIcon = " Btn--icon-after";
            else if (btn.getStr1() != null && btn.getStr2() == null && btn.getStr1().substring(0, 5).equals("icon-"))
                classIcon = " Btn--square";
        }

        String HTML =  "<button class='Btn Btn--" + btn.getType() + classIcon + "' onclick='" + btn.getFunction() + "' style='" + btn.getStyle() + "' " + btn.getAttribute() + ">";
        if(btn.getStr1()!=null) HTML += btn.getStr1().substring(0,5).equals("icon-") ? "<i class='icon " + btn.getStr1() + "'></i>" : btn.getStr1();
        if(btn.getStr2()!=null) HTML += btn.getStr2().substring(0,5).equals("icon-") ? "<i class='icon " + btn.getStr2() + "'></i>" : btn.getStr2();
        HTML += "</button>";
        return HTML;

    }

    /*
   * Cria objeto Btn
   * str1 (String)
   * str2 (String)
   * type (String)
   * function (String)
   * style (String)
   * attribute (String)
   * @return btn (Btn)
   */
    public Btn createButton(String str1, String str2, String type, String function, String style, String attribute ){

        Btn btn = new Btn();
        btn.setStr1(str1);
        if(str2!=null) btn.setStr2(str2);
        if(type!=null) btn.setType(type);
        if(function!=null) btn.setFunction(function);
        if(style!=null) btn.setStyle(style);
        if(attribute!=null) btn.setAttribute(attribute);
        return btn;
    }

    //--------------------------------opções de botao

   /*
    * Insere botão devidamento configuradp
    * @param str1 (String) pode ser um texto ou referencia  de fontawesome
    * @param str2 (String) pode ser um texto, referencia  de fontawesome, Tipo de botão [success, danger] ou função (ex: "function()")
    * @param type (String) Tipo de botão [success, danger]
    * function (String) ex: "function()"
    * style (String)
    * attribute (String)
    * @return String HTML
    */

    public String btn(String str){
        return buttonHTML(createButton(str,null,null,null,null,null));
    }
    public String btn(String str1, String str2){
        String type = null;
        String text = null;
        String function = null;
        String[] types = {"success","success-outline","danger","danger-outline"};
        if( Arrays.asList(types).contains(str2) )type = str2;
        else if(str2.substring(str2.length()-2,str2.length()).equals("()")) function = str2;
        else text = str2;
        return buttonHTML(createButton(str1,text,type,function,null,null));
    }
    public String btn(String str1, String str2, String function){
        String type = null;
        String text = null;
        String[] types = {"success","success-outline","danger","danger-outline"};
        if( Arrays.asList(types).contains(str2) )type = str2;
        else text = str2;
        return buttonHTML(createButton(str1,text,type,function,null,null));
    }
    public String btn(String str1, String str2, String type, String function){
        return buttonHTML(createButton(str1,str2,type,function,null,null));
    }
    public String btn(String str1, String str2, String type, String function, String style, String attribute){
        return buttonHTML(createButton(str1,str2,type,function,style,attribute));
    }

}
