let Tstring = prompt("enter a string")
let re=/[aeiou]/g ;
let firstchar=Tstring.charAt(0)

let end = Tstring.length;
let lastchar=Tstring.charAt(end-1)

if(firstchar==lastchar)
{
    if(firstchar.match(re))
    {
        console.log(true)
    }
    console.log(false)
}
else{
    console.log(false)
}
