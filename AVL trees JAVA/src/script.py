#shebang #!/usr/bin/env python
import subprocess
import sys
def experiment():
   f = open ("oklist.txt", "r") 
   data = f.readlines(100000)
   for line in data:
      #subprocess.call("java AccessAVLApp.java " + line[0:10], shell=True) 
      subprocess.call("java AccessAVLApp.java ")

experiment()