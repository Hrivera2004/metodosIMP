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
    
    
    
    //métodos para crud de arboles
    /*
    public void load(String nombre) throws FileNotFoundException, IOException {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);

        //le mando el nombre para que me lo busque el que se llama asi
        FileReader fr = new FileReader(nombre);
        BufferedReader br = new BufferedReader(fr);
        String miline;

        //lo añado a la row
        while ((miline = br.readLine()) != null) {
            String[] info = miline.split(",");
            modelo.addRow(info);
        }

        //cierro
        br.close();
        fr.close();
    }

    public void crear(String nombre) throws IOException {
        //crear el archivo con el nombre
        File archivo = new File(nombre);
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);

        //agarro las filas y columnas de la tabla
        int fila = jTable.getRowCount();
        int columna = jTable.getColumnCount();
        String[][] info = new String[fila][columna];

        //escribo la info
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                info[i][j] = (String) jTable.getValueAt(i, j);
                bw.write(info[i][j] + ";");
            }
            bw.newLine();
        }
        
        bw.close();
        fw.close();

    }

    public void clear() {
        DefaultTableModel modelo2 = (DefaultTableModel) jTable.getModel();
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            for (int j = 0; j < modelo2.getColumnCount(); j++) {
                modelo2.setValueAt("", i, j);
            }
        }
    }

    public void refresh() {
        DefaultTreeModel m = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Archivo");
        m.setRoot(c);
        File x = new File("./");
        File[] f = x.listFiles();
        for (File miarchivo : f) {
            if (miarchivo.getName().endsWith(".txt")) {
                c.add(new DefaultMutableTreeNode(miarchivo.getName()));
            }
        }
        jTree.setModel(m);
        m.reload();
    }*///termina metodos crud
    
    
    //método combo box
    /*
    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        if (tab.getSelectedIndex() == 1) {
            adminPersona ap=new adminPersona("./aleros.cbm");
            ap.cargarArchivo();
            DefaultComboBoxModel modelo
                        = new DefaultComboBoxModel( 
                                ap.getListaPersonas().toArray() );
            cb_amigos.setModel(modelo);
            
           
        }
    } *///end
    
       //resize image
    /*        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", 
                "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(100, 100, 0);
            this.lb_foto.setIcon(new ImageIcon(img));

        }*///end
}
