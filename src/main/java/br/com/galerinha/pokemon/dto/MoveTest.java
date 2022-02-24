package br.com.galerinha.pokemon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MoveTest {

    private String name;
    private String status;

    public List<MoveTest> generateTestList(){
        return List.of(
                new MoveTest("ember", "burn"),
                new MoveTest("thunder-punch", "paralysis"),
                new MoveTest("ice-punch", "freeze"),
                new MoveTest("stomp", "none")
        );
    }
}
