import org.example.*;
import org.junit.jupiter.api.Test;


class VisitorTest {

    @Test
    void testTypeCheckingVisitorWithAssignmentNode() {
        AssignmentNode n1 = new AssignmentNode();
        n1.setTypeleftHandVar("String");
        n1.setTyperightHandExp("String");

        NodeVisitor v1 = new TypeCheckingVisitor();


        n1.accept(v1);
    }

    @Test
    void testTypeCheckingVisitorWithVariableRefNode() {
        VariableRefNode n2 = new VariableRefNode();
        n2.setNomeVar("minhaVariavel");

        NodeVisitor v1 = new TypeCheckingVisitor();

        n2.accept(v1);


    }

    @Test
    void testCodeGeneratingVisitorWithAssignmentNode() {
        AssignmentNode n1 = new AssignmentNode();
        n1.setTypeleftHandVar("String");
        n1.setTyperightHandExp("String");

        NodeVisitor v2 = new CodeGeneratingVisitor();

        n1.accept(v2);


    }

    @Test
    void testCodeGeneratingVisitorWithVariableRefNode() {
        VariableRefNode n2 = new VariableRefNode();
        n2.setNomeVar("minhaVariavel");

        NodeVisitor v2 = new CodeGeneratingVisitor();

        n2.accept(v2);


    }
}
