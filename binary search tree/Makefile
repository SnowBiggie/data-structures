# Karabelo Motaung
# 05 April 2021

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=StudentInformation.class binarySearchTreeNode.class AccessArrayApp.class AccessBSTApp.class 
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class

runarray: $(CLASS_FILES)
	java -cp $(BINDIR) AccessArrayApp
runbst: $(CLASS_FILES)
	java -cp $(BINDIR) AccessBSTApp