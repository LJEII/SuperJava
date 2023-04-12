/*******************
public class simon {
    package pkg;

    class Cls {

        native double f(int i, String s);

     ...

    }

    The C function with the long mangled name Java_pkg_Cls_f_ILjava_lang_String_2 implements native method f:



    Code Example 2-1 Implementing a Native Method Using C
    jdouble Java_pkg_Cls_f__ILjava_lang_String_2 (
            JNIEnv *env,        /* interface pointer */
            jobject obj,        /* "this" pointer */
            jint i,             /* argument #1 */
            jstring s)          /* argument #2 */
    {
        /* Obtain a C-copy of the Java string */
     const char *str = (*env)->GetStringUTFChars(env, s, 0);

        /* process the string */
     ...

        /* Now we are done with str */
        (*env)->ReleaseStringUTFChars(env, s, str);

        return ...
    }
}

*/