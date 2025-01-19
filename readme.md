For creating ssh key in local

1) Navigate to Home Directory using command - cd ~

2) cd .ssh && ssh-keygen (For Defaults, click on Enter/Return key for both inputs)

Generating public/private rsa key pair.
Enter file in which to save the key (/Users/username/.ssh/id_rsa):      
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /Users/usernmae/.ssh/id_rsa.
3) After that , Do "ls". you will find id_rsa.pub file.

4) Copy the contents in the id_rsa.pub file (read using the cat command - cat id_rsa.pub)

5) Navigate to BitBucket or any version tool which supports the SSH keys. Paste the contents using the Add Key Option