/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mandelli
 */
public class TextHandler {
    public static byte numItens = 4;
    public static List<String> lerArquivo(String caminhoArquivo) throws IOException {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
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
    
    public static void escreverEmArquivo(List<String> conteudo, String nomeArquivo) {
        try {
            // Verificar se o arquivo existe e se o usuário tem permissão de escrita
            File file = new File(nomeArquivo);
            if (!file.canWrite()) {
                System.out.println("Você não tem permissão para escrever neste arquivo.");
                return;
            }
            List<String> linhas = new ArrayList<>();
            linhas.addAll(lerArquivo(nomeArquivo));
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

}
