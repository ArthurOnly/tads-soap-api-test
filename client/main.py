from zeep import Client

client = Client('http://127.0.0.1:8000/user-server?wsdl')

def interface():
    print("------------------")
    print("1 - Listar        ")
    print("2 - Cadastrar     ")
    print("3 - Deletar       ")
    print("99 - Sair         ")

def handle_choice(choice):
    if choice == 1:
        print(client.service.index())
    elif choice == 2:
        print(handle_create())
    elif choice == 3:
        print(handle_delete())
    elif choice == 99:
        return True
    return False

def handle_list():
    return client.service.index()

def handle_create():
    username = input("Insira um username: ")
    email = input("Insira um email: ")
    return client.service.create(username, email)

def handle_delete():
    id = int(input("Insira um ID: "))
    return client.service.delete(id)

def start():
    while True:
        interface()
        choice = int(input("Selecione uma opção: "))
        is_exit = handle_choice(choice)
        if is_exit:
            break

if __name__ == '__main__':
    start()