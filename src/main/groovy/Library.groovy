import groovy.transform.CompileStatic
import mypack.JavaClass
import mypack.OtherClass

@CompileStatic
static JavaClass someLibraryMethod() {
    OtherClass oc = new OtherClass()
    JavaClass jc = new JavaClass(oc, 5)
    return jc
}
