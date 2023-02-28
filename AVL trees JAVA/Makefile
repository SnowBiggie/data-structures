# Karabelo Motaung
# 17 April 2021

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=StudentInformation.class BinaryTreeNode.class BinaryTree.class AVLTree.class AccessAVLApp.class 
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class

runavl: $(CLASS_FILES)
	java -cp $(BINDIR) AccessAVLApp
	
javadoc:$(SRCDIR)
	find ./src -type f -name "*.java" | xargs javadoc -d ./doc