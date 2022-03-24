import java.io.File;
import java.io.IOException;

public class RenameFilesJava {
 
    public static void main(String[] argv) throws IOException {
        String nomDossier = "test"; //mettre le nom du dossier
        int premierNum = 0; //mettre le numéro de départ
        File dossier = new File(nomDossier); 
        File[] liste = dossier.listFiles();

        for (int i = 0; i < liste.length; i++) {

            if (liste[i].isFile()) { 
                File f = new File(nomDossier+liste[i].getName()); 
                String extension = "";
                String ancien = liste[i].getName();
                int index = ancien.lastIndexOf('.');
                if (index > 0) {
                    extension = ancien.substring(index+1);
                }
                if(extension.equals("png")){
                    String nouveau = premierNum+".png";
                    boolean k = f.renameTo(new File(nouveau));
                    System.out.println(k);
                    System.out.println(ancien+" renommé => "+nouveau);
                }
                else{
                System.out.println(ancien+" n'est pas un fichier png");
                }
            }
            premierNum++;
        }
        System.out.println("Opération terminée!");
    }
}