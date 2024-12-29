# Git Commands for Initializing a New Project

If the project is not already in a remote branch, follow these steps to initialize the project:

1. **Initialize the Git repository**
    ```sh
    git init
    ```

2. **Create a new repository on GitHub**
    - Copy the HTTPS remote link `<url>` of the new repository.

3. **Add the remote repository**
    ```sh
    git remote add origin <url>
    ```

4. **Add the files**
    ```sh
    git add .
    ```

5. **Commit the changes**
    ```sh
    git commit -m "Your commit message"
    ```

6. **Push to the remote repository**
    ```sh
    git push -u origin master
    ```
