use std::env;
use std::net::IpAddr;
use std::str::FromStr; /* Allows to convert String to IP-Address */

struct Arguments {
    flag: String,
    ipaddr: IpAddr,
    threads: u16,
}

impl Arguments {
    fn new(args: &[String]) -> Result<Arguments, &'static str> {
        /* Static because we want to send the string to main func. */
        if args.len() < 2 {
            return Err("Not Enought Arguments");
        } else if args.len() > 4 {
            return Err("Too Many Arguments");
        } else {
            let f = args[1].clone();

            if let Ok(ipaddr) = IpAddr::from_str(&f) {
                return Ok(Arguments {
                    flag: String::from(""),
                    ipaddr,
                    threads: 4,
                });
            } else {
                let flag = args[1].clone();
                if flag.contains("-h") || flag.contains("-help") && args.len() == 2 {
                    println!(
                        "Usage: -j to select number of threads\r\n
                            -h or -help to show this help message"
                    );
                    return Err("help");
                }
            }
        }
    }
}

fn main() {
    let args: Vec<String> = env::args().collect();
    let _program = args[0].clone();
}
