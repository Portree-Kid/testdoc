This project demonstrates the unability of apache poi to load documents containing "data:" html embedded images. The example document originated from ASCII Doctor and can be regenerated via "pandoc -f html -tdocx testdoc.html -o testdoc.docx"  
The Junit Test "TestPoi" fails to load the docx (src/test/resources/testdoc.docx).
