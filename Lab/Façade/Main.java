public class Main {
 public static void main(String[] args) {
   System.out.println();
     Object ruleEngineInstance = new Object();

     RuleEngine ruleEngine = new RuleEngineFacade(ruleEngineInstance);
     String operation = "makeNewSale";
     boolean isValid = ruleEngine.isValidOperation(operation);

     System.out.println("Operation '" + operation + "' is " + (isValid ? "valid" : "invalid"));
 }
}
