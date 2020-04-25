package fuzzy;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;

public class Combustivel {

    public static double calculaConsumo(double velocidade, double temperatura) {
        String filename = "/home/rafael/IdeaProjects/FuzzyCombustivel/src/fuzzy/combustivel.fcl";
        FIS fis = FIS.load(filename);

        FunctionBlock functionBlock = fis.getFunctionBlock(null);

        functionBlock.setVariable("velocidade", velocidade);
        functionBlock.setVariable("ar_condicionado", temperatura);

        functionBlock.evaluate();

        functionBlock.getVariable("consumo").defuzzify();

        return functionBlock.getVariable("consumo").getValue();
    }
}
