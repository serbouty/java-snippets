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
