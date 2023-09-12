
        System.out.println("Enter your size :");
        int size = sc.nextInt();
        String name[] = new String[size];
        System.out.println("Enter "+size+" Names :");
        for (int i = 0; i < size; i++) {
            name[i]= sc.next();
        }

        for (int i = 0; i < name.length; i++) {

            System.out.println("name " + (i+1) +" is : " + name[i]);

        }