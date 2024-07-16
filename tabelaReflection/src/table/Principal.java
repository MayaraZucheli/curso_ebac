package table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> nomeTabela = new ArrayList<>();
        nomeTabela.add("Mayara");
        nomeTabela.add("Felipe");
        nomeTabela.add("Dom");
        nomeTabela.add("Misha");

        List<Integer> idadeTabela = new ArrayList<>();
        idadeTabela.add(33); 
        idadeTabela.add(35);
        idadeTabela.add(5);
        idadeTabela.add(7); 
        
        Class<?> cls = Principal.class;
        
        Field[] fields = cls.getDeclaredFields();
        
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof anotation) {
                    String[] tabelaNomes = ((anotation) annotation).tabela();
                    
                    System.out.println("Nome da tabela: " + tabelaNomes[0]);
                }
            }
        }

        System.out.println("Nome\t\tIdade");
        System.out.println("----------------------");
        for (int i = 0; i < nomeTabela.size(); i++) {
            System.out.println(nomeTabela.get(i) + "\t\t" + idadeTabela.get(i));
        }
    }
}

