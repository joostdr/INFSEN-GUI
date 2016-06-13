package main;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MainClass extends JFrame{

    public MainClass() {
        initUI();
    }

    private JPanel total;
    private JPanel leftRow;
    private JPanel centerRow;
    private JPanel rightRow;
    private JPanel addAndReset;
    private Border border;


    private void initUI(){
        total = new JPanel();
        leftRow = createLeftRow();
        centerRow = createCenterRow();
        rightRow = createRightRow();


        border = BorderFactory.createLineBorder(Color.black);
        leftRow.setBorder(border);
        rightRow.setBorder(border);
        total.setLayout(new BoxLayout(total, BoxLayout.X_AXIS));
        total.add(leftRow);
        total.add(centerRow);
        total.add(rightRow);
        add(total);
        setTitle("Boodschappen lijst");
        setSize(900,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JPanel createLeftRow(){
        JPanel leftRow = new JPanel();
        leftRow.setPreferredSize(new Dimension(0,0));
        leftRow.setLayout(new BoxLayout(leftRow,BoxLayout.Y_AXIS));
        JPanel dropDownWithLabel = new JPanel();
        dropDownWithLabel.setLayout(new BoxLayout(dropDownWithLabel, BoxLayout.Y_AXIS));
        dropDownWithLabel.add(new JLabel("Select a product"));
        String[] products = {"Banaan", "Appel", "Meme"};
        JComboBox productList = new JComboBox(products);
       // productList.setMaximumSize(new Dimension(2000,1000));
        productList.setSelectedIndex(0);
        dropDownWithLabel.add(productList);
        dropDownWithLabel.setPreferredSize(new Dimension(leftRow.getWidth(),4));
        dropDownWithLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        dropDownWithLabel.setMaximumSize(new Dimension(3000,3000));

        addAndReset = new JPanel();
        JButton add = new JButton("add");
        JButton reset = new JButton("reset");
        addAndReset.add(add);
        addAndReset.add(reset);

        leftRow.add(dropDownWithLabel);
        leftRow.add(addAndReset);
        leftRow.add(new JLabel("Total price:"));


        return leftRow;
    }

    private JPanel createCenterRow(){
        JPanel centerRow = new JPanel();
        centerRow.setPreferredSize(new Dimension(0,0));
        centerRow.setLayout(new BoxLayout(centerRow,BoxLayout.Y_AXIS));
        DefaultListModel<String> listModel = new DefaultListModel();
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        JList<String> list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) list.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        JScrollPane listScoller = new JScrollPane(list);
        listScoller.setPreferredSize(new Dimension(250,80));
        centerRow.add(listScoller);
        return centerRow;
    }

    private JPanel createRightRow(){
        JPanel rightRow = new JPanel();
        return rightRow;
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.setVisible(true);
    }

}
