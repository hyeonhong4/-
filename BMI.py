from tkinter import *

def calculate():
    my_height = float(height.get())/100
    my_weight = float(weight.get())
    BMI = my_weight/(my_height * my_height)
    if BMI >= 30 :
        body = '비만'
    elif BMI >= 25 :
        body = '과체중'
    elif BMI >= 18.5 :
        body = '정상'
    else :
        body = '저체중'
    labelresult=Label(master,text="당신의 몸 상태는 %s 입니다." % body,bg='white').grid(row=7, column=2)
    return

master = Tk()
master.geometry('400x200')
master.title('BMI')

height=StringVar()
weight=StringVar()

label1=Label(master, text='Welcome to the BMI Calculator').grid(row=0, column=2)
label2=Label(master, text='Enter height(Cm): ').grid(row=1, column=0)
label2=Label(master, text='Enter weight(Kg): ').grid(row=2, column=0)

myheight=Entry(master, textvariable=height).grid(row=1, column=2)
myweight=Entry(master, textvariable=weight).grid(row=2, column=2)

button1 = Button(master, text='Caculate BMI',fg='blue', command=calculate).grid(row=3, column=0)
button2 = Button(master, text="Quit",fg='red', command=master.quit).grid(row=3, column=1)
master.mainloop()


