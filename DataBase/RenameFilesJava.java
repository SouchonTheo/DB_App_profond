import java.io.File;
import java.io.IOException;

public class RenameFilesJava {
 
    public static void main(String[] argv) throws IOException {

        File dossier = new File("c:\\test");
        File[] liste = dossier.listFiles();

        for (int i = 0; i < liste.length; i++) {

            if (liste[i].isFile()) { // si c'est un fichier
             
             //récupérer le fichier en cours
             File f = new File("c:\\test\\"+liste[i].getName()); 
             String extension = "";
             String ancien = liste[i].getName();
             
             //vérifier que l'extension est txt
             int index = ancien.lastIndexOf('.');
             if (index > 0) {
                 extension = ancien.substring(index+1);
             }
             if(extension.equals("txt")){
                 String nouveau = "f"+i+".txt";
                 f.renameTo(new File("c:\\test\\"+nouveau));
                 
                 System.out.println(ancien+" renommé => "+nouveau);
             }
             else{
              System.out.println(ancien+" n'est pas un fichier txt");
             }
            }
        }

        System.out.println("Opération terminée!");
    }
}