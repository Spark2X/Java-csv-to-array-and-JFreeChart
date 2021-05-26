package javaapplication1;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;

import org.apache.commons.lang3.ObjectUtils;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart extends JFrame {

   private static final long serialVersionUID = 1L;
   
   public BarChart() throws IOException {
       createBarChart();
   }

   public BarChart(String applicationTitle, String chartTitle) throws IOException {
        super(applicationTitle);
        
        // based on the dataset we create the chart
        JFreeChart pieChart = ChartFactory.createBarChart(chartTitle, "Categoria", "Numero", createDataset(),PlotOrientation.VERTICAL, true, true, false);

        // Adding chart into a chart panel
        ChartPanel chartPanel = new ChartPanel(pieChart);
      
        // settind default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      
        // add to contentPane
        setContentPane(chartPanel);
    }
   
  
   private CategoryDataset createDataset() throws IOException {
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
      
      final String queimadas = "Numero de queimadas";

      // create the dataset...
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

      dataset.addValue(acre, "Acre", queimadas);
      dataset.addValue(alagoas, "Alagoas", queimadas);
      dataset.addValue(amazonas, "Amazonas", queimadas);
      dataset.addValue(amapa, "Amapa", queimadas);
      dataset.addValue(bahia, "Bahia", queimadas);
      dataset.addValue(ceara, "Ceara", queimadas);
      dataset.addValue(df, "Distrito Federal", queimadas);
      dataset.addValue(espiritoSanto, "Espirito Santo", queimadas);
      dataset.addValue(goias, "Goias", queimadas);
      dataset.addValue(maranhao, "Maranhao", queimadas);
      dataset.addValue(matoGrosso, "Mato Grosso", queimadas);
      dataset.addValue(matoGrossoDoSul, "Mato Grosso do Sul", queimadas);
      dataset.addValue(minasGerais, "Minas Gerais", queimadas);
      dataset.addValue(para, "Para", queimadas);
      dataset.addValue(paraiba, "Paraiba", queimadas);
      dataset.addValue(parana, "Parana", queimadas);
      dataset.addValue(pernambuco, "Pernambuco", queimadas);
      dataset.addValue(piaui, "Piaui", queimadas);
      dataset.addValue(rioDeJaneiro, "Rio de Janeiro", queimadas);
      dataset.addValue(rioGrandeDoNorte, "Rio Grande do Norte", queimadas);
      dataset.addValue(rioGrandeDoSul, "Rio Grande do Sul", queimadas);
      dataset.addValue(rondonia, "Rondonia", queimadas);
      dataset.addValue(roraima, "Roraima", queimadas);
      dataset.addValue(santaCatarina, "Santa Catarina", queimadas);
      dataset.addValue(saoPaulo, "Sao Paulo", queimadas);
      dataset.addValue(sergipe, "Sergipe", queimadas);
      dataset.addValue(tocantins, "Tocantins", queimadas);

      return dataset;
     
  }
   
   private static BufferedReader getCSV(String filename) throws IOException {
       BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\" + filename));
       
       return csvReader;
   }

   public void createBarChart() throws FileNotFoundException, IOException {
      BarChart barChart = new BarChart("", "Queimadas 01/2021 - 24/05/2021");
      barChart.pack();
      barChart.setVisible(true);
   }
}

