import lombok.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

//@Builder Não tem uma relação direta com Padrão de Projeto Builder.
//Começa a fazer sentido quando existem objetos com muitos atributos, pois desonera
//Cria uma "casca", um objeto estático que vai estar sempre alocado em memória, não sendo necessário dar um New Object a cada criação
//Permite criar objetos com os parâmetros que deseja, não sendo necessário criar construtores diferentes.
//https://refactoring.guru/pt-br/design-patterns/builder#:~:text=O%20padr%C3%A3o%20Builder%20permite%20que,enquanto%20ele%20est%C3%A1%20sendo%20constru%C3%ADdo.&text=Algumas%20das%20etapas%20de%20constru%C3%A7%C3%A3o,construir%20v%C3%A1rias%20representa%C3%A7%C3%B5es%20do%20produto.

@Builder
@Data
public class Person {
    private String name;
    private LocalDate birthdayDate;
}


