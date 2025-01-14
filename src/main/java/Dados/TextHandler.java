/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import Interfaces.Telas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mandelli
 */
public class TextHandler {
    public static byte numItens = 4;
    public static String nomeArquivo = "lista.txt";
    public static List<String> lerArquivo() throws IOException {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add((linha));
            }
        }catch(Exception e){
            
        }
        return linhas;
    }
    
    public static String[] separarItens(String linha) {
        // Remove as aspas duplas do início e do fim da string
        String[] itens = linha.split(",");
        for(String i : itens){
            linha = linha.replaceAll(",", "");
        }
        return itens;
    }
    
    public static List<String[]> getDados(){
        try {
            List<String> linhas = lerArquivo();
            List<String[]> dados = new ArrayList<>();
            int i = 0;
            for(String linha : linhas){
                for(int j = 0; j < numItens; j++){
                    if(!separarItens(linhas.get(i))[0].equals(null)){
                        dados.add(separarItens(linhas.get(i)));
                    }
                }
                i++;
            }
            return dados;
        } catch (IOException ex) {
            Telas.falha("erro: " + ex);
            return null;
        }
    }
    
    public static void escreverEmArquivo(List<String> conteudo) {
        try {
            // Verificar se o arquivo existe e se o usuário tem permissão de escrita
            File file = new File(nomeArquivo);
            if (!file.canWrite()) {
                System.out.println("Você não tem permissão para escrever neste arquivo.");
                return;
            }
            List<String> linhas = new ArrayList<>();
            linhas.addAll(lerArquivo());
            linhas.addAll(conteudo);
            int cont = 0;
            try (FileWriter writer = new FileWriter(nomeArquivo)) {
                for (String linha : linhas) {
                    writer.write(linhas.get(cont)+"\n");
                    cont++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    
     public static void escreverArquivo() {
        try {
            // Verificar se o arquivo existe e se o usuário tem permissão de escrita
            File file = new File(nomeArquivo);
            if (!file.canWrite()) {
                System.out.println("Você não tem permissão para escrever neste arquivo.");
                return;
            }
            List<String> linhas = new ArrayList<>();
            linhas.addAll(lerArquivo());
            int cont = 0;
            try (FileWriter writer = new FileWriter(nomeArquivo)) {
                for (String linha : linhas) {
                    writer.write(linhas.get(cont)+"\n");
                    cont++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
     }
        
        public static void removeItem(int indexRemove){
        try {
            // Verificar se o arquivo existe e se o usuário tem permissão de escrita
            File file = new File(nomeArquivo);
            if (!file.canWrite()) {
                System.out.println("Você não tem permissão para escrever neste arquivo.");
                return;
            }
            List<String> linhas = new ArrayList<>();
            linhas.addAll(lerArquivo());
            int cont = 0;
            try (FileWriter writer = new FileWriter(nomeArquivo)) {
                for (String linha : linhas) {
                    if(cont != indexRemove) writer.write(linhas.get(cont)+"\n");
                    cont++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        
    }

}
