function validation(){
    var name = document.reg.name.value
    var password = document.reg.password.value
    var dob = document.reg.date1.value
    var address = document.reg.addr.value
    var education = document.reg.qualify.value
    if(name==" "|| name.length<=6){
        alert("enter the username atleast of 6 characters")
    }
    else if(password){

    }
    else if(dob==" "){
        alert("enter the date of birth")
    }
    else if(addr==" "){
        alert("enter the address")
    }
    else if(qualify=" "){
        alert("enter the education qualified")
    }
    else{
    return check()
    }
}
function registration