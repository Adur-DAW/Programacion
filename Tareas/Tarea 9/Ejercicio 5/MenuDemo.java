import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class MenuDemo implements ActionListener
{
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar()
    {
        JMenu menuArchivo = new JMenu("Archivo");
        menuArchivo.setMnemonic(KeyEvent.VK_A);

        JMenuItem abrirItem = new JMenuItem("Abrir", KeyEvent.VK_T);
        abrirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        abrirItem.getAccessibleContext().setAccessibleDescription("Abrir");
        abrirItem.addActionListener(this);

        JMenuItem cerrarItem = new JMenuItem("Cerrar", KeyEvent.VK_T);
        cerrarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        cerrarItem.getAccessibleContext().setAccessibleDescription("Cerrar");
        cerrarItem.addActionListener(this);

        menuArchivo.add(abrirItem);
        menuArchivo.add(cerrarItem);

        JMenu menuEdicion = new JMenu("Edición");
        menuEdicion.setMnemonic(KeyEvent.VK_A);

        JMenuItem copiarItem = new JMenuItem("Copiar", KeyEvent.VK_T);
        copiarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        copiarItem.getAccessibleContext().setAccessibleDescription("Abrir");
        copiarItem.addActionListener(this);

        JMenuItem pegarItem = new JMenuItem("Pegar", KeyEvent.VK_T);
        pegarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        pegarItem.getAccessibleContext().setAccessibleDescription("Cerrar");
        pegarItem.addActionListener(this);

        menuEdicion.add(copiarItem);
        menuEdicion.add(pegarItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuArchivo);
        menuBar.add(menuEdicion);

        return menuBar;
    }

    public Container createContentPane()
    {
        JPanel contentPane = new JPanel(new BorderLayout());

        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        contentPane.add(scrollPane , BorderLayout.CENTER);
        return contentPane;
    }

    private void abrirArchivo()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter()
            {
                public boolean accept(File file) {
                    String filename = file.getName();
                    return (filename.endsWith(".txt") || file.isDirectory());
                }

                public String getDescription() {
                    return "Archivo de texto TXT";
                }
            });

        int result = chooser.showOpenDialog(new Frame());

        switch (result)
        {
            case JFileChooser.APPROVE_OPTION:
                String rutaArchivo = obtenerRutaArchivo(chooser);
                output.setText(obtenerContenidoArchivo(rutaArchivo));
                break;
            case JFileChooser.CANCEL_OPTION:
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }

    private String obtenerContenidoArchivo(String rutaArchivo)
    {
        String key = "";

        try {
            FileReader file = new FileReader(rutaArchivo);
            BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();

            while (line != null) {
                key += line;
                line = reader.readLine();
            }
        }
        catch (Exception e){}

        return key;
    }

    private String obtenerRutaArchivo(JFileChooser chooser)
    {
        File archivo = chooser.getSelectedFile();
        return archivo.getPath();
    }

    public static String pegarClipboard()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        Transferable t = clipboard.getContents(null);
        try {
            if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor))
                return (String) t.getTransferData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
        } catch (IOException e) {
        }

        return null;
    }

    public static void copiarClipboard(String str)
    {
        StringSelection ss = new StringSelection(str);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        clipboard.setContents(ss, null);
    }

    private void cerrarPrograma()
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent e)
    {
       switch (e.getActionCommand())
       {
           case "Abrir":
               abrirArchivo();
               break;
           case"Cerrar":
               cerrarPrograma();
               break;
           case "Copiar":
               copiarClipboard(output.getText());
               break;
           case"Pegar":
               output.append(pegarClipboard());
               break;
       }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MenuDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuDemo demo = new MenuDemo();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
}