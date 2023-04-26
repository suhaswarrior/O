public class RuleEngineFacade implements RuleEngine {
 private Object sport2000RuleEngine;

 public RuleEngineFacade(Object sport2000RuleEngine) {
     this.sport2000RuleEngine = sport2000RuleEngine;
 }

 @Override
 public boolean isValidOperation(String operation) {
     boolean result = false;
     try {
         java.lang.reflect.Method method = sport2000RuleEngine.getClass().getMethod("validateOperation", String.class);
         result = (boolean) method.invoke(sport2000RuleEngine, operation);
     } catch (Exception e) {
         System.out.println("Error invoking method on rule engine: " + e.getMessage());
     }
     return result;
 }
}
