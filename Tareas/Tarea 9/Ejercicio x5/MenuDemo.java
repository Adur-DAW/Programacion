import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class MenuDemo implements ActionListener, ItemListener
{
    JTextArea output;
    JScrollPane scrollPane;
    String newline = "\n";

    public JMenuBar createMenuBar()
    {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        // crea la barra de menú
        menuBar = new JMenuBar();
        // Construcción del primer menú
        menu = new JMenu("Un menú");
        // Establece una short-key
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("El único menú de este programa que tiene menu items");
        menuBar.add(menu);
        // un grupo de JMenuItems
        menuItem = new JMenuItem("Un menú ítem con sólo texto", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        //Mensaje de texto cuando se lanza un evento
        menuItem.getAccessibleContext().setAccessibleDescription("Esto no hace nada");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        // carga un icono para un menú ítem.
        ImageIcon icon = createImageIcon("blue.gif");
        menuItem = new JMenuItem("Both text and icon", icon);
        menuItem.setMnemonic(KeyEvent.VK_B);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menuItem= new JMenuItem(icon);
        menuItem.setMnemonic(KeyEvent.VK_D);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        //Un grupo de ítems radio button
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("Un menú ítem de tipo radio button");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        rbMenuItem = new JRadioButtonMenuItem("Otro adicional");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        // un grupo de Items check box
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("Un menu item de tipo checkbox");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);
        cbMenuItem = new JCheckBoxMenuItem("Otro mas");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);
        // Un submenú. Añade una línea horizontal
        menu.addSeparator();
        submenu = new JMenu("Un submenú");
        submenu.setMnemonic(KeyEvent.VK_S);
        menuItem = new JMenuItem("Un ítem en el submenú");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        menuItem = new JMenuItem("Otro ítem");
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        menu.add(submenu);
        // Construcción del segundo menú
        menu = new JMenu("Otro menú");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription("Este menú no hace nada");
        menuBar.add(menu);
        return menuBar;
    }
    public Container createContentPane()
    {
        // Crear el contenedor para toda la aplicación JPanel
        JPanel contentPane = new JPanel(new BorderLayout());
        // Crea un text area can barra de desplazamiento
        output = new JTextArea(5, 30);
        // No hay posibilidad de modificación del text area
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        // Añade el textarea al content pane
        contentPane.add(scrollPane , BorderLayout.CENTER);
        return contentPane;
    }
    // Acciones a realizar cuando cuando un evento
    public void actionPerformed(ActionEvent e)
    {
        JMenuItem source = (JMenuItem)(e.getSource());
        String s ="Detectado un evento de tipo acción." + newline +
                "Fuente del evento " + source.getText() + " (una instancia de "
                + getClassName(source) + ")";
        output.append(s + newline);
    }
    // Acciones a realizar cuando cambia un ítem
    public void itemStateChanged(ItemEvent e)
    {
        JMenuItem source = (JMenuItem)(e.getSource());
        String s = "Detectado un evento de tipo item." + newline
                + " Fuente del evento: " + source.getText() + " (una instancia de "
                + getClassName(source) + ")" + newline + "Nuevo estado: " +
                ((e.getStateChange()==ItemEvent.SELECTED)? "selected": "unselected");
        output.append(s + newline);
    }
    // Devuelve el nombre de la clase, no informa del paquete.
    // Esta clase ha sido la responsable del lanzamiento del
    // evento correspondiente.
    protected String getClassName(Object o)
    {
        String classString = o.getClass().getName();
        int dotIndex = classString.lastIndexOf(".");
        return classString.substring(dotIndex+1);
    }

    // Devuelve una instancia de ImageIcon o
    // si el path no es correcto
    // Es un icono que se emplea para un menu item
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MenuDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("No se pudo encontrar e1 fichero: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        // Creación de la ventana.
        JFrame frame = new JFrame("MenuDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creación de la barra de menú y el content pane.
        MenuDemo demo = new MenuDemo();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
        // Muestra la ventana.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
}