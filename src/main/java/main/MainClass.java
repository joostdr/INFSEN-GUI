package main;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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
        listModel.addElement("Banaan");
        listModel.addElement("Appel");
        listModel.addElement("Peer");
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
        rightRow.setLayout(new BoxLayout(rightRow, BoxLayout.Y_AXIS));
        JPanel pictureAndProductInfo = new JPanel();
        JPanel nameCategoryPrice = new JPanel();
        JPanel productName = new JPanel(new GridLayout(1,2));
        JPanel productCategory = new JPanel(new GridLayout(1,2));
        JPanel productPrice = new JPanel(new GridLayout(1,2));
        JPanel descriptionContainer = new JPanel();
        JPanel description = new JPanel(new GridLayout(1,2));
        nameCategoryPrice.setLayout(new BoxLayout(nameCategoryPrice, BoxLayout.Y_AXIS));
        try {
            BufferedImage picture = ImageIO.read(new File("src/main/resources/img/banana.png"));
            picture = resizeImage(picture);
            JLabel pic = new JLabel(new ImageIcon(picture));
            pictureAndProductInfo.add(pic);
        }catch(Exception e){
            System.out.println("File not found");
        }
        JLabel product = new JLabel("Name: ");
        JLabel category = new JLabel("Category: ");
        JLabel price = new JLabel("Price: ");

        JLabel productName1 = new JLabel("");
        JLabel productCategory1 = new JLabel("");
        JLabel productPrice1 = new JLabel("");

        productName.add(product);
        productName.add(productName1);

        productCategory.add(category);
        productCategory.add(productCategory1);

        productPrice.add(price);
        productPrice.add(productPrice1);

        nameCategoryPrice.add(productName);
        nameCategoryPrice.add(productCategory);
        nameCategoryPrice.add(productPrice);


        pictureAndProductInfo.add(nameCategoryPrice);
        rightRow.add(pictureAndProductInfo);

        descriptionContainer.add(new JLabel("Description: "));
        descriptionContainer.add(new JLabel("Een banaantje"));

        description.add(descriptionContainer);

        rightRow.add(description);
        rightRow.add(new JButton("Delete"));
        return rightRow;
    }

    private BufferedImage resizeImage(BufferedImage image){
        Image tmp = image.getScaledInstance(160,160, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(160, 160, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(tmp, 0, 0, null);
        g.dispose();
        return resizedImage;
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.setVisible(true);
    }

}
