package core.annotations;

// Declaring an Annotation Type.

@ClassPreamble (    // add metadata with an annotation
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)

class CustomTypeDemo { }
