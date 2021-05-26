package javaapplication1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PieChart extends JFrame {

    public PieChart() throws IOException {

        initUI();
    }

    private void initUI() throws IOException {

        DefaultPieDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Pie chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private DefaultPieDataset createDataset() throws IOException {
        int acre = 0;
       int alagoas = 0;
       int amapa = 0;
       int amazonas = 0;
       int bahia = 0;
       int ceara = 0;
       int df = 0;
       int espiritoSanto = 0;
       int goias = 0;
       int maranhao = 0;
       int matoGrosso= 0;
       int matoGrossoDoSul = 0;
       int minasGerais = 0;
       int para = 0;
       int paraiba = 0;
       int parana = 0;
       int pernambuco = 0;
       int piaui = 0;
       int rioDeJaneiro = 0;
       int rioGrandeDoNorte = 0;
       int rioGrandeDoSul = 0;
       int rondonia = 0;
       int roraima = 0;
       int santaCatarina = 0;
       int saoPaulo = 0;
       int sergipe = 0;
       int tocantins = 0;
       
       String row;
        String[] data;
        int i = 0;
        
        BufferedReader csvReader = getCSV("b.csv");
        
        while ((row = csvReader.readLine()) != null) {
            data = row.split(",");
            
            if (i != data.length - 1)
                i++;
            
            for (int j = 1;j <= data.length -1; j++) {
//                System.out.println(data[j]);
                if (j == 3) {
                    if (!(data[j].equals("estado")))
                        
                        if (data[j].equals("ACRE")) {
                            acre++;
                        }
                    
                        if (data[j].equals("ALAGOAS")) {
                            alagoas++;
                        }
                        
                        if (data[j].equals("AMAPA")) {
                            amapa++;
                        }
                        
                        if (data[j].equals("AMAZONAS")) {
                            amazonas++;
                        }
                        
                        if (data[j].equals("BAHIA")) {
                            bahia++;
                        }
                        
                        if (data[j].equals("CEARA")) {
                            ceara++;
                        }
                        
                        if (data[j].equals("DISTRITO FEDERAL")) {
                            df++;
                        }
                        
                        if (data[j].equals("ESPIRITO SANTO")) {
                            espiritoSanto++;
                        }
                        
                        if (data[j].equals("GOIAS")) {
                            goias++;
                        }
                        
                        if (data[j].equals("MARANHAO")) {
                            maranhao++;
                        }
                        
                        if (data[j].equals("MATO GROSSO")) {
                            matoGrosso++;
                        }
                        
                        if (data[j].equals("MATO GROSSO DO SUL")) {
                            matoGrossoDoSul++;
                        }
                        
                        if (data[j].equals("MINAS GERAIS")) {
                            minasGerais++;
                        }
                        
                        if (data[j].equals("PARA")) {
                            para++;
                        }
                        
                        if (data[j].equals("PARAIBA")) {
                            paraiba++;
                        }
                        
                        if (data[j].equals("PARANA")) {
                            parana++;
                        }
                        
                        if (data[j].equals("PERNAMBUCO")) {
                            pernambuco++;
                        }
                        
                        if (data[j].equals("PIAUI")) {
                            piaui++;
                        }
                        
                        if (data[j].equals("RIO DE JANEIRO")) {
                            rioDeJaneiro++;
                        }
                        
                        if (data[j].equals("RIO GRANDE DO NORTE")) {
                            rioGrandeDoNorte++;
                        }
                        
                        if (data[j].equals("RIO GRANDE DO SUL")) {
                            rioGrandeDoSul++;
                        }
                        
                        if (data[j].equals("RONDONIA")) {
                            rondonia++;
                        }
                        
                        if (data[j].equals("RORAIMA")) {
                            roraima++;
                        }
                        
                        if (data[j].equals("SANTA CATARINA")) {
                            santaCatarina++;
                        }
                        
                        if (data[j].equals("SAO PAULO")) {
                            saoPaulo++;
                        }
                        
                        if (data[j].equals("SERGIPE")) {
                            sergipe++;
                        }
                        
                        if (data[j].equals("TOCANTINS")) {
                            tocantins++;
                        }
                }
            }
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Acre", acre);
        dataset.setValue("Alagoas", alagoas);
        dataset.setValue("Amapa", amapa);
        dataset.setValue("Amazonas", amazonas);
        dataset.setValue("Bahia", bahia);
        dataset.setValue("Ceara", ceara);
        dataset.setValue("Distrito Federal", df);
        dataset.setValue("Espirito Santo", espiritoSanto);
        dataset.setValue("Goias", goias);
        dataset.setValue("Maranhao", maranhao);
        dataset.setValue("Mato Grosso", matoGrosso);
        dataset.setValue("Mato Grosso do Sul", matoGrossoDoSul);
        dataset.setValue("Minas Gerais", minasGerais);
        dataset.setValue("Para", para);
        dataset.setValue("Parana", paraiba);
        dataset.setValue("Pernambuco", pernambuco);
        dataset.setValue("Piaui", piaui);
        dataset.setValue("Rio de Janeiro", rioDeJaneiro);
        dataset.setValue("Rio Grande do Norte", rioGrandeDoNorte);
        dataset.setValue("Rio Grande do Sul", rioGrandeDoSul);
        dataset.setValue("Rondonia", rondonia);
        dataset.setValue("Roraima", roraima);
        dataset.setValue("Santa Catarina", santaCatarina);
        dataset.setValue("Sao Paulo", saoPaulo);
        dataset.setValue("Sergipe", sergipe);
        dataset.setValue("Tocantins", tocantins);
        

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Queimadas 01/2021 - 24/05/2021",
                dataset,
                false, true, false);

        return pieChart;
    }
    
    private static BufferedReader getCSV(String filename) throws IOException {
       BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\" + filename));
       
       return csvReader;
    }

    public void getPieChart() {

        EventQueue.invokeLater(() -> {

            try {
                PieChart ex = new PieChart();
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(PieChart.class.getName()).log(Level.SEVERE, null, ex1);
            }
        });
    }
}