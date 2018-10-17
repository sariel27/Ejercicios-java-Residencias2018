/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author Ernesto
 */
public class morse_texto {
   private  String morse=" ";
    public String traducirMorse(String mensaje){
		
				String letras = "abcdefghijklmnopqrstuvwxyz 0123456789";
				String codigo[] = new String[60];
				int ch=0;
                                String ch2;
		                 for (int i = 0; i < mensaje.length(); i++) {
                             if(mensaje.charAt(i)==' '){
                                 ch=1;
                             }
                          }
                                 if(ch==1){
                                     ch2="";
                                 }
                                 else{
                                     ch2=" ";
                                 }
				codigo[0] = ".-"; //.-
				codigo[1] = "-...";//-...
				codigo[2] = "c";//-.-.
				codigo[3] = "-..";//d
				codigo[4] = ".";//e
				codigo[5] = "..-.";//f
				codigo[6] = "--.";//g
				codigo[7] = "....";//h
				codigo[8] = "..";//i
				codigo[9] = ".---";//j
				codigo[10] = "-.-";//k
				codigo[11] = ".-..";//l
				codigo[12] = "--";//m
				codigo[13] = "-.";//n
				codigo[14] = "---";//o
				codigo[15] = ".--.";//p
				codigo[16] = "--.-";//q
				codigo[17] = ".-.";//r
				codigo[18] = "...";//s
				codigo[19] = "-";//t
				codigo[20] = "..-";//u
				codigo[21] = "...-";//v
				codigo[22] = ".--";//w
				codigo[23] = "-..-";//x
				codigo[24] = "-.--";//y
				codigo[25] = "--..";//z
				codigo[26] = ch2;//espacio
				codigo[27] = "-----";//0
				codigo[28] = ".----";//1
				codigo[29] = "..---";//2
				codigo[30] = "...--";//3
				codigo[31] = "....-";//4
				codigo[32] = ".....";//5
				codigo[33] = "-....";//6
				codigo[34] = "--...";//7
				codigo[35] = "---..";//8
				codigo[36] = "----.";//9
				String oracion[] = mensaje.split(" ");
				int max = oracion.length;
				
		        for  (int i = 0; i < max; i++){
		        	for (int j = 0; j < 60; j++)
		        		if (oracion[i].equals(codigo[j])) {
		        			morse = morse+letras.charAt(j);
		        			break;
		        		}
		        }
				return morse; 
	}
    public String getmorse(){
        return morse;
    }
}
