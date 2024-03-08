/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosimportantes;

/**
 *
 * @author hriverav
 */
public class MetodosImportantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //
    }
    
    
    //método de listar en el arbol - posiblemente usar jlist
    /*public void listar_todo(File p_raiz, DefaultMutableTreeNode nodo){  
    try{
        ArrayList<File> l1=new ArrayList();
        ArrayList<File> l2=new ArrayList();
        ArrayList<File> l3=new ArrayList();
        for (File f : p_raiz.listFiles()) {
            if (f.isDirectory()) {
                l1.add(f);
            }else{
                l2.add(f);
            }
        }
       l3.addAll(l1);
       l3.addAll(l2);
       
        for(File temp:l3){
            if( temp.isFile() ){                
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);      
            }else{
                DefaultMutableTreeNode n=new DefaultMutableTreeNode(
                        temp.getName());
                nodo.add(n);  
                listar_todo(temp,n);
            }
        } 
    }
    catch(Exception e){    
        e.printStackTrace();
    }
    }*///end of recursive method
    
    
    //crear nueva carpeta
    /*
    public File createNewFolder(File containingDir) {
        File folder = new File(containingDir, "New Folder");
        folder.mkdir();
        return folder;
    }*///end of create new folder
    
    
}
