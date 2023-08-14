import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {
    private JComboBox gifJComboBox;
    private JLabel label;
    private String names[] = {"bom-dia.gif", "bday.gif"};
    private Icon icons[] = {new ImageIcon(getClass().getResource( names[0] )),
                            new ImageIcon(getClass().getResource( names[1] ))};

    public ComboBoxFrame() {
        super("Gif Selector");
        setLayout( new FlowLayout());
        gifJComboBox = new JComboBox( names );
        gifJComboBox.setMaximumRowCount(2);
        gifJComboBox.addItemListener( new ItemListener() {
            public void itemStateChanged (ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon( icons[gifJComboBox.getSelectedIndex()]);
                }
            }
        });
        add(gifJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}