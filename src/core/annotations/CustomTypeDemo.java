package core.annotations;

import java.lang.annotation.Documented;

// Declaring an Annotation Type.

@Documented // make the information appear in Javadoc
@interface ClassPreamble {  // define the annotation type
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}

@ClassPreamble (    // add metadata with an annotation
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)

public class CustomTypeDemo {

    // class code goes here

}
